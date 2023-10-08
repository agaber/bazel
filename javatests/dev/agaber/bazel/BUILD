load("@contrib_rules_jvm//java:defs.bzl", "JUNIT5_DEPS", "java_test_suite")

java_test_suite(
    name = "tests",
    size = "small",
    srcs = glob(["*.java"]),
    package = "dev.agaber.bazel",
    runner = "junit5",
    runtime_deps = JUNIT5_DEPS,
    deps = [
        "//java/dev/agaber/bazel",
        "//java/dev/agaber/common/testing",
        "//third_party:assertj",
        "//third_party:junit5",
    ],
)
