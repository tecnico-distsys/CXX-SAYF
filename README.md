# SAYF

**S**earch **A**nd **Y**ou will **F**ind project

Distributed Systems special project

## Authors

CXX
_preencher com identificador e depois apagar esta linha_

... ... ...

_preencher com nome, número e GitHub ID e depois apagar esta linha_


### Module leaders

For each module, the README file must identify the lead developer and the contributors.
The leads should be evenly divided among the group members.


### Code identification

In all the source files (including POMs), please replace __CXX__ with your Campus: A (Alameda) or T (Tagus); and your number.

This is important for code dependency management 
i.e. making sure that your code runs using the correct components and not someone else's.


## Getting Started

The overall system is composed of multiple servers and clients.
The main server is _depot_. 
The clients are _seeker_ and _feeder_.

See the [project statement](https://github.com/tecnico-distsys/SAYF/tree/EE) for a full description of the domain and the system.



### Prerequisites

Java Developer Kit 8 or 11 is required running on Linux, Windows or Mac.
Maven 3 is also required.

To confirm that you have them installed, open a terminal and type:

```
javac -version

mvn -version
```


### Installing

To compile and install all modules:

```
mvn clean install -DskipTests
```

The tests are skipped because they require each server to be running.


## Built With

* [Maven](https://maven.apache.org/) - Build Tool and Dependency Management
* [gRPC](https://grpc.io/) - RPC framework



## Versioning

We use [SemVer](http://semver.org/) for versioning. 


