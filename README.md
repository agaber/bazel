# Bazel

Bazel is Google's open-sourced version of their internal build tool called Blaze
(bazel is an anagram of blaze). I experimented with this because I was
investigating solutions for [Monorepos][1] (and perhaps partly out of nostalgia).

There are other open source solutions but Bazel seems to have the widest choice
of programming languages. It is also quite complicated. In a fully JVM world, I
would most likely recommend using a multi-project Maven or Gradle setup. Other
popular frameworks seem to be mostly geared towards JavaScript/TypeScript. They
include Turboreo, Nx, Rush, Yarn Workspace and PNPM Workspaces.

[1]: https://en.wikipedia.org/wiki/Monorep]

## Links

* https://bazel.build/
* https://github.com/bazelbuild/bazel
* https://github.com/bazel-contrib/rules_jvm
* https://github.com/bmuschko/bazel-examples

## Install (on Mac)

```shell
% brew install bazel
% brew install buildifier
```

## IntelliJ

Install the bazel plugin and restart the IDE. After that you should see an
"Import Bazel Project..." when you start IntelliJ. Click that and follow the
Wizard until you get to the "Select project view" window. Then select
"import project view file" and choose the .bazelproject file from this directory.

## Compiling

```shell
% bazel build java/dev/agaber/...
```

## Executing

```shell
% bazel run java/dev/agaber/bazel:bazeltool
```

Alternatively

```shell
% bazel build java/dev/agaber/bazel:bazeltool_deploy.jar
% java -jar bazel-bin/java/dev/agaber/bazel/bazeltool_deploy.jar
```

## Testing

```shell
% bazel test javatests/dev/agaber/bazel/...
```
