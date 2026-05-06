# ☕ JavaCases

![Java](https://img.shields.io/badge/Java-21%2B-orange?style=flat&logo=java)
![License](https://img.shields.io/badge/License-MIT-green?style=flat)

A collection of Java case studies demonstrating OOP, basic system design, and practical coding patterns. Each folder under `src/` is a small, self-contained example you can compile and run.

---

## 📁 Project Structure (high-level)

- `src/` — all Java source files and package folders
- `CasePDF/` — PDF descriptions and case materials

Key modules:
- `src/CityHospital/` — hospital staffing & patient examples (package `CityHospital`)
- `src/CityPublicLibrary/` — simple library system
- `src/ShopEasy/` — product & digital product examples
- `src/SmartRetailBillingSystem/` — packaged billing system under its own `src/` folder
- `src/UniversityCourseRegSystem/` — course registration example
- `src/VideoGameInventorySystem/` — inventory and item/weapon examples
- Top-level examples: `BasicBankingApplication.java`, `EmployeePayrollSystem.java`, `BookStoreSystem.java`, `ShoppingCartSystem.java`, `VotingSystem.java`, `TempConvert.java`, etc.

---

## 🚀 Quick Start / Run

Two common setups are used in this repo: top-level (default package) programs and package-based modules.

1) Top-level classes (no package)

Compile a single file from the `src/` directory and run it directly. Example:

```
javac src/BasicBankingApplication.java
java -cp src BasicBankingApplication
```

2) Package-based modules (have a `package` declaration)

Compile the package sources into an output directory, then run the package-qualified main class. Example for `CityHospital`:

```
mkdir out
javac -d out src/CityHospital/*.java
java -cp out CityHospital.Main
```

Tip: You can compile a single module by targeting its folder; for the whole project consider using an IDE (IntelliJ/VS Code) which handles classpaths automatically.

---

## 🧾 Git / GitHub

- To save and push this README change:

```
git add README.md
git commit -m "docs: update README with overview and run instructions"
git push
```

- Repository description, topics, and a license badge can be set on GitHub web UI under the repository `Settings` → `General`.

---

## 🧠 Concepts Covered

- Object-Oriented Programming (Classes, Objects, Inheritance)
- Encapsulation & Data Hiding
- Conditionals & Loops
- Methods & Return Types
- Simple system modeling and input/output handling

---

## 👨‍💻 Author

**Shehan Sulakshana**  
Cybersecurity undergraduate | Java learner  
[GitHub](https://github.com/ShehanSulakshana)

---

*"Case by case, concept by concept."* 🚀
