# Setup and First Run

1. Open this folder in IntelliJ IDEA.
2. Confirm Project SDK is Java 21.
3. Open `pom.xml` and allow Maven to download dependencies.
4. Run `mvn test` in the terminal.
5. Confirm all tests pass.
6. Review each test before committing it to GitHub.

## GitHub
Connect this project to the GitHub repository you created:

```bash
git init
git add .
git commit -m "chore: initialise QA API testing project"
git branch -M main
git remote add origin YOUR_GITHUB_REPOSITORY_URL
git push -u origin main
```

After that, commit genuine changes as you develop. Do not make one giant final commit.
