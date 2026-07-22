# Java DSA Practice

A collection of Data Structures and Algorithms practice problems solved in Java.

## Folder Structure

```
DSA-JAVA/
├── src/
│   ├── Basics/
│   │   ├── Learning/              ← Concept practice files
│   │   └── Problems/              ← Solved DSA questions
│   ├── Arrays/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── Strings/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── Recursion/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── Sorting/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── Searching/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── LinkedList/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── Stack/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── Queue/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── Trees/
│   │   ├── Learning/
│   │   └── Problems/
│   ├── Graph/
│   │   ├── Learning/
│   │   └── Problems/
│   └── DynamicProgramming/
│       ├── Learning/
│       └── Problems/
├── .gitignore
└── README.md
```

## Learning vs Problems

| Folder | Purpose | Example |
|--------|---------|---------|
| `Learning/` | Concept practice, syntax exploration, topic understanding | `VariablesDataTypesInput.java` |
| `Problems/` | Solved DSA questions, interview-style problems | `SumOfEvenDigits.java` |

- **Learning** files help you understand a topic. They stay in `Learning/` forever as reference.
- **Problems** are actual solved DSA questions. Each problem is a single self-contained `.java` file.

## Naming Conventions

**Learning files** — Descriptive names based on what you learned:
```
VariablesDataTypesInput.java
ConditionalStatementsCalculator.java
LoopsMultiplicationTable.java
```

**Problem files** — Use the actual problem name in PascalCase:
```
SumOfEvenDigits.java
CountDigits.java
ReverseNumber.java
LargestElement.java
```

## Rules

- **One Java file per problem** — Each solution is self-contained in a single `.java` file.
- **Topic-wise organization** — Place every file in its correct `Learning/` or `Problems/` folder under the topic.
- **No duplicate solutions** — Do not add a problem that already exists.
- **Keep original logic** — Preserve the original solution logic; only formatting or renaming is allowed.
- **No generic file names** — Avoid names like `Day1.java`, `Practice.java`, `Temp.java`.

## How to Add New Solved Questions

1. Create your `.java` file with the problem name (e.g. `LargestElement.java`).
2. Add `package <Topic>.Problems;` at the top (e.g. `package Arrays.Problems;`).
3. Place it in `src/<Topic>/Problems/`.

## How to Add New Topics

1. Create a new folder under `src/` (e.g. `Hashing`).
2. Inside it, create `Learning/` and `Problems/` subfolders.
3. Start adding files following the naming convention.

## How to Compile & Run

```bash
# Compile all Java files
javac -d out src/**/*.java

# Run a specific solution
java -cp out Basics.Problems.SumOfEvenDigits
```

## Goals

- Beginner-friendly and scalable for 500+ DSA problems
- Clean, topic-wise separation for easy navigation
- Minimal dependencies — pure Java, no external libraries
