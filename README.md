# scala-djl

A repository to start using DJL with Scala 3 quickly.

## Pre-requisite

You need a working java environment with a recent jdk (21+ advised).

You can install it from [Adoptium](https://adoptium.net/).

## Editing the code

You can use this project with most of the scala editors but  we advise you to
use [VSCode](https://code.visualstudio.com/). When you will open this folder,
it will recommend you the *metals* and *scala-lang* extensions, you should
accept.

## Running the program

To run the program, use the following command:

```
./mill run
```

If you create extra entry points, you will need to configure the one to use.

## Extending the code

The entry point is the `src/tech/numind/Main.scala` file. Modify it to add your
code, and feel free to add new files to architecture your program.

## References

DJL: [DJL official documentation](https://docs.djl.ai/)

Scala 3: [Scala3 official documentation](https://docs.scala-lang.org/)
