# DefSocBackend
## Deployment guide
- clone the repository https://github.com/lipinska-anna/def-soc-backend
```bash
git clone https://github.com/lipinska-anna/def-soc-backend.git
```
- clone the repository https://github.com/lipinska-anna/def-soc-assessment
```bash
git clone https://github.com/lipinska-anna/def-soc-assessment.git
```
- open docker-compose.yml file and change the path to the def-soc-assessment folder
```bash
services.def-soc-assessment.build.context: YOUR_PATH
```
- run the following command to build docker compose
```bash
docker compose up --build
```
---
By default, the application will be available on http://localhost:4200

The backend application is exposed on port 8080
Report data is served on http://localhost:8080/api/report

The frontend application is exposed on port 4200