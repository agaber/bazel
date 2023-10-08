load("//:junit5.bzl", "junit5_test")

junit5_test(
    name = "tests",
    srcs = glob(["*.java"]),
    test_package = "dev.agaber.bazel",
    deps = [
        "//java/dev/agaber/bazel",
        "//java/dev/agaber/common/testing",
        "//third_party:assertj",
        "//third_party:junit5",
    ],
)
