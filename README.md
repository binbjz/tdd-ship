Unit Test
===========================

Moves a ship around Earth seas. Earth is represented as a grid.

Meet the following requirements:
--
- Given the initial starting point (x, y) of a ship and the direction (n, s, e, w) it is facing.

- Implement commands that move the ship forward and backward (f, b).

- Implement commands that turn the ship left and right (l, r).

- The ship can receive a string with commands ("lrfb" is equivalent to left, right, forward, backwards).

- Earth, as any other planet is a sphere. Implement wrapping from one edge of the grid to another.

- Not the whole planet consists of seas. Roughly 30% is surface are islands and continents. Implement surface detection before each move to a new position.

This is a simple and complete program. It will show you how to write a good unit test.

How to run it：
--
- Run tests and generate a test report.
```sh
$ ./gradlew clean test
```
or
- Run tests and generate both test and coverage reports.
```sh
$ ./gradlew clean test jacocoTestReportBin
```
