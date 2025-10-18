@echo off
set FX=C:\Users\crhar\OneDrive\Desktop\Java_projects\openjfx-25_windows-x64_bin-sdk\javafx-sdk-25\lib
java --module-path "%FX%" --add-modules javafx.controls,javafx.fxml -cp out application.Main
