# DP_Lab1
This is the github repo for Decision Procedure Course, Lab -1

# Pre-requisites
You should have mvn and Java 11 or a later version installed on your machine. Verify using:

```
 which mvn
 /usr/bin/mvn
```

```
 echo $JAVA_HOME
 /usr/lib/jvm/java-11-openjdk-amd64
```

# Run Program

1. Create input formula in a file such as:
```
echo "P & Q" > /tmp/input.cnf
```
2. Run following command from the DP_LAB1 folder containing 'pom.xml' file
```
cat /tmp/input.cnf | mvn compile exec:java -Dexec.args="-o /tmp/output.cnf"
```
3. Equisatisfiable DIMAS CNF will be generated at output file mentioned in step 2, i.e., /tmp/output.cnf file. You can view it with:
```
cat /tmp/output.cnf
```

4. The program throws "InvalidInputException" if input formula is invalid. It throws "FileNotFoundException" if output file can't be opened.


