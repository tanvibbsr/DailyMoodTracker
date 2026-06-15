# Daily Mood Tracker

## Overview

Daily Mood Tracker is a Java command-line application that allows users to record and track their moods over time.

Users can:
- Add mood entries
- Store a mood, date, and note
- View all mood entries
- Save and load entries from a CSV file
- Track mood history over time

Data is stored locally in a CSV file and does not require a database.

--------------------------------------------------

## Features

- Add a mood entry
- View all mood entries
- Persistent storage using CSV files
- Input validation
  - Prevents empty mood entries
  - Validates date format (YYYY-MM-DD)

--------------------------------------------------

## Project Structure

```
DailyMoodTracker/
│
│──main.java
│──moodEntry.java
│──moodTracker.java
│──fileManager.java
│
├── data/
│   └── moods.csv
|
│──.gitignore
└── README.md
```

--------------------------------------------------

## Requirements

- Java 17 or later
- VS Code, IntelliJ, Eclipse, or terminal

--------------------------------------------------

## How to Run

### Compile

Navigate to the source directory:

```bash
javac *.java
```

### Run

```bash
java main
```

---

## Test Data

Example mood entries:

| Date | Mood | Notes |
|--------|--------|--------|
| 2026-06-13 | Happy | Got to eat ice cream |
| 2026-06-14 | Excited | Watching World Cup games|
| 2026-06-15 | Nervous | First day of college |
