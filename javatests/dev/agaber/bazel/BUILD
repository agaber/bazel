load("@rules_jvm_external//:defs.bzl", "artifact")
load("@contrib_rules_jvm//java:defs.bzl", "JUNIT5_DEPS", "java_test_suite")

java_test_suite(
    name = "bazel-tests",
    srcs = glob(["*.java"]),
    runner = "junit5",
    test_suffixes = ["Test.java"],
    runtime_deps = JUNIT5_DEPS,
    deps = [
        "//java/dev/agaber/bazel",
        "//java/dev/agaber/common/testing",
        artifact("org.assertj:assertj-core"),
        artifact("org.junit.jupiter:junit-jupiter-api"),
        artifact("org.junit.jupiter:junit-jupiter-params"),
    ],
)
