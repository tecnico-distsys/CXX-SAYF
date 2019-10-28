# Seeker application

## Authors

Group CXX

### Lead developer 

... ... ...

_preencher com nome, número e GitHub ID de membro do grupo que liderou esta parte e depois apagar esta linha_

### Contributors

... ... ...

... ... ...

_preencher com nome, número e GitHub ID dos membro do grupo que contribuiram com código para esta parte e depois apagar esta linha_

## About

This is a CLI (Command-Line Interface) that can query a Depot server, looking for lost device observations.


## Instructions for using Maven

To compile and run using _exec_ plugin:

```
mvn compile exec:java
```

To generate launch scripts for Windows and Linux
(the POM is configured to attach appassembler:assemble to the _install_ phase):

```
mvn install
```

To run using appassembler plugin on Windows:

```
target\appassembler\bin\feeder arg0 arg1 arg2
```

To run using appassembler plugin on Linux:

```
./target/appassembler/bin/feeder arg0 arg1 arg2
```


## To configure the Maven project in Eclipse

'File', 'Import...', 'Maven'-'Existing Maven Projects'

'Select root directory' and 'Browse' to the project base folder.

Check that the desired POM is selected and 'Finish'.


----

