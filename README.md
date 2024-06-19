# scala-djl
A repository to start using djl with scala quickly

## Pre-requisite

You need a working java environment with a recent jdk (21+ advised)

## Opening the code

You can use this project with most of the scala editors, here are directions
to use some of them

### Visual studio code

Install the `metals` extension and open the project

### IntelliJ idea

Install the scala extension and open the project.
If it fails or the project is not correctly recognized,
delete the `.idea` directory and try again.

## Running the program

To run the program, use the following command:

```
./mill run
```

If you create extra entry points, you will need to configure the one to use.

## Extending the code

The entry point is the `src/tech/numind/Main.scala` file. Modify it to add your
code, and feel free to add new files to architecture your program.

More information on djl: [DJL official documentation](https://docs.djl.ai/)

More information on scala: [Scala3 official documentation](https://docs.scala-lang.org/)
