load("@rules_jvm_external//:defs.bzl", "artifact")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "assertj",
    exports = [
        artifact("org.assertj:assertj-core"),
    ],
)

java_library(
    name = "junit4",
    exports = [
        "@maven//:junit_junit",
        "@maven//:org_hamcrest_hamcrest_core",
    ],
)

java_library(
    name = "junit5",
    exports = [
        artifact("org.junit.jupiter:junit-jupiter-api"),
        artifact("org.junit.jupiter:junit-jupiter-params"),
    ],
)
