# ☕ JavaCases

![Java](https://img.shields.io/badge/Java-21%2B-orange?style=flat&logo=java)

Welcome — this repo collects small, easy-to-run Java projects you can read, compile, and learn from. Each example focuses on one idea (OOP, simple systems, or I/O) so you can explore concepts one case at a time.

---

## What you'll find

- Short, self-contained examples in `src/`
- PDF case descriptions in `CasePDF/`
- Small modules grouped by topic (hospital, library, retail, university, games)

Examples are intentionally simple to read and modify — great for learning or small demos.

---

## Quick start (friendly)

Pick an example and run it. Two styles appear in this repo:

- Top-level programs (no `package`): compile the single file and run it from `src/`.

	Example — run the banking app:

	```bash
	javac src/BasicBankingApplication.java
	java -cp src BasicBankingApplication
	```

- Package-based examples (use a `package` line): compile the folder and run the package main class.

	Example — run the CityHospital demo:

	```bash
	mkdir out
	javac -d out src/CityHospital/*.java
	java -cp out CityHospital.Main
	```

If you use an IDE (VS Code, IntelliJ) you can import the folder and run mains directly.

---

## Helpful notes

- If a program reads input, run it from a terminal so you can type responses.
- To compile many files at once, point `javac` at a folder or use `javac src/**/*.java` depending on your shell.

---

## Save changes to GitHub

After editing `README.md` or code locally, run:

```bash
git add README.md
git commit -m "docs: humanize README"
git push
```

If `git push` fails because the branch has no upstream, run:

```bash
git push --set-upstream origin main
```

---

## Contributing

Got a clearer example or fix? Send a PR or open an issue. Small improvements welcome.

---

## Author

**Shehan Sulakshana** — Cybersecurity undergraduate & Java learner

---

Happy learning! 🚀
