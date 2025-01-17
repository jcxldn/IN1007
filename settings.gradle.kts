/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 * For more detailed information on multi-project builds, please refer to https://docs.gradle.org/8.8/userguide/multi_project_builds.html in the Gradle documentation.
 */

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "IN1007"
include("weeks:w3")
include("weeks:w3:ex1")
include("weeks:w3:ex2")
include("weeks:w3:ex5")
include("weeks:w3:ex6")
include("weeks:w3:ex7")
include("weeks:w3:lecture")
include("weeks:w4:ex1")
include("weeks:w4:ex2")
include("weeks:w4:ex3")
include("weeks:w4:ex4")
include("weeks:w4:ex6")
include("weeks:w4:lecture")
include("weeks:w7:ex4")
include("weeks:w8:lecture")
include("weeks:w8:ex1")
include("weeks:w8:ex2")
include("weeks:w9:coursework")
include("weeks:w10:ex1")