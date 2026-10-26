# Dash

A simple side-scrolling game inspired by Geometry Dash and the Chrome dino game. Avoid crashing into the moving obstacles. If you fail, the game restarts, and your score is based on how long you survive.

## Tech
- Java 21
- JavaFX 23 (UI built with SceneBuilder)

## How to run
You need **JDK 21+** and the **[JavaFX SDK 23](https://gluonhq.com/products/javafx/)**.

**Eclipse (how it was built):** create a JavaFX project, put the files in the `application` package, and run `Main.java`.

**Command line:**
```bash
# PATH_TO_FX = the lib folder of your JavaFX SDK
javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml -d out *.java
cp *.fxml out/application/ && touch out/application/application.css
java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml -cp out application.Main
```
The app loads an `application.css` stylesheet, which Eclipse's JavaFX template normally creates. If you don't have one, an empty file works.

## Controls
| Key | Action |
|---|---|
| `W` | Jump |
| `A` | Move left |
| `D` | Move right |

Press **Play** to start.
