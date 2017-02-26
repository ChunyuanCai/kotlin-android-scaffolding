# Kotlin Android Scaffolding Project
Just the basic structure of a kotlin android project. Still a WIP.


Architectural approach
-----------------
The idea is to follow up Android clean architecture approach:
- [Architecting Android…The clean way?](http://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/)
- [Architecting Android…The evolution](http://fernandocejas.com/2015/07/18/architecting-android-the-evolution/)


Build System approach
-----------------
The build system is based on gradle, so for instance the project can be easily imported to both Android Studion and Intellij. 


Testing approach
-----------------
Tests are split up into Acceptance and Unit tests and essentially follow up the approach in this article I have written: 
- [Android Testing with Kotlin](https://fernandocejas.com/2017/02/03/android-testing-with-kotlin/)


Usage
-----------------
For now, the only way to use this WIP is by cloning the repo and manually setting it up. Go to the next section to see how to get started with the main files involved in the configuration. 


Setup
-----------------
Once the repository is cloned, follow this up:
- You will have to rename the main packages manually.
- Configuration and dependencies versions sit on the [depedencies.gradle](https://github.com/android10/kotlin-android-scaffolding/blob/master/buildsystem/dependencies.gradle) file.
- There is a [ci.gradle](https://github.com/android10/kotlin-android-scaffolding/blob/master/buildsystem/ci.gradle) file for Travis and CI setup. 


Dependencies
-----------------
So far, these dependencies have been added:
- Android Annotations
- Android Compat
- Dagger 2 
- RxJava 2
- RxAndroid 2
- Retrofit 2
- JUnit 4
- Robolectric 3
- Mockito Kotlin
- Kluent
- Espresso
- Leak Canary


Gradle tasks
-----------------

Here are some useful Gradle/adb commands:

 * `./gradlew clean build` - Build the entire app and execute unit and integration tests plus lint check.
 * `./gradlew installDebug` - Install the debug apk on the current connected device.
 * `./gradlew deployDebug` - Install and executes the debug apk on the current connected device.
 * `./gradlew runUnitTests` - Execute unit and integration tests. 
 * `./gradlew runAcceptanceTests` - Execute acceptance tests.
 
 
Next steps
-----------------
- Automate all the things.
- Fix issues.
 
 
License
-----------------

    Copyright 2017 Fernando Cejas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


![http://www.fernandocejas.com](https://github.com/android10/Sample-Data/blob/master/android10/android10_logo_big.png)
