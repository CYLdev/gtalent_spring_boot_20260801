# Agent working notes

## Required workflow

Before handling any new request in this project, read this `AGENT.md` file first.

## Conversation record

### 2026-08-15 — Gmail SMTP authentication failure

User reported `500 Internal Server Error` from `GET /mail/test`.

Root exception:

```text
org.springframework.mail.MailAuthenticationException: Authentication failed
jakarta.mail.AuthenticationFailedException:
535-5.7.8 Username and Password not accepted
```

Relevant application configuration:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=${GMAIL_USERNAME}
spring.mail.password=${GMAIL_PASSWORD}
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

Relevant code locations:

- `service/MailService.java`, `sendEmail`, calls `JavaMailSender.send`.
- `controller/MailController.java`, `GET /mail/test`.

Findings:

- SMTP host, port 587, and STARTTLS are appropriate.
- The failure occurs after reaching Gmail, during SMTP authentication; it is not a controller, network, or TLS error.
- `.env` contains non-empty `GMAIL_USERNAME` with valid email format and no whitespace.
- `.env` contains a 16-character alphanumeric `GMAIL_PASSWORD` with no whitespace. Its value must be a currently valid Gmail App Password created for the exact same Google account as `GMAIL_USERNAME`; do not put secrets in this file.
- Gmail requires 2-Step Verification before an App Password can be created. A Google Account password must not be used for SMTP. App Passwords are revoked when the Google Account password changes.
- The source file read from this workspace had the import text embedded in a commented line, rather than an active property. The desired saved form is:

```properties
# Load values from .env
spring.config.import=optional:file:.env[.properties]
```

- A screenshot showed the desired active property in VS Code, but the workspace file read by the agent still showed it as commented. Confirm the editor is saving this exact path:

```text
C:\Users\USER\OneDrive\Documents\gtalent202608\gtalent_spring_boot_20260801\src\main\resources\application.properties
```

- Fully restart Spring Boot after changing `.env` or configuration. A running JVM retains the values it loaded at startup.

Latest supplied log still reports the same Gmail `535-5.7.8 Username and Password not accepted` error.

### 2026-08-15 — Codex executable lookup

`where.exe codex` returned:

```text
C:\Users\USER\AppData\Local\Programs\OpenAI\Codex\bin\codex.exe
```
