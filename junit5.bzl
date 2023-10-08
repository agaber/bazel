# See https://github.com/bmuschko/bazel-examples/blob/master/java/junit5-test/junit5.bzl
# A BUILD file must exist in the same directory (even if just an empty file) for
# this to work.

def junit5_test(name, srcs, test_package, deps = [], runtime_deps = [], size = "small", **kwargs):
    FILTER_KWARGS = [
        "main_class",
        "use_testrunner",
        "args",
    ]

    for arg in FILTER_KWARGS:
        if arg in kwargs.keys():
            kwargs.pop(arg)

    junit_console_args = []
    if test_package:
        junit_console_args += ["--select-package", test_package]
    else:
        fail("must specify 'test_package'")

    native.java_test(
        name = name,
        size = size,
        srcs = srcs,
        use_testrunner = False,
        main_class = "org.junit.platform.console.ConsoleLauncher",
        args = junit_console_args,
        deps = deps + [
            "@maven//:org_junit_jupiter_junit_jupiter_engine",
        ],
        runtime_deps = runtime_deps + [
            "@maven//:org_junit_platform_junit_platform_console",
        ],
        **kwargs
    )
