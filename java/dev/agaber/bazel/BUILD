package(default_visibility = ["//visibility:public"])

java_library(
    name = "bazel",
    srcs = glob(["*.java"]),
)

java_binary(
    name = "bazeltool",
    main_class = "dev.agaber.bazel.Application",
    runtime_deps = [":bazel"],
)
