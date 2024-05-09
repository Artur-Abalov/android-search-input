android-search-input
================

A search input with numpad and submit button

## Installation guide

### 1. Setup development enviroment

* Download and install [Android Studio](https://developer.android.com/studio)

### 2. Get the source code.

```
    git clone https://github.com/Artur-Abalov/android-search-input.git
```

### 3. Open the project in android studio, sync the dependencies and run it

## Brief code explanation

As a main ui-tool I selected jetpack compose, with other libraries.

The project folder structure is following
* base - contains overall interfaces(here only EventListener)
* components - reusable ui elements
* navigation - everything related to navigation
* screens - application screens with their viewmodels, states and events

As an architectural pattern I used MVI. 
Each screen has its own viewmodel and event list if required(resultscreen currently has no data)
