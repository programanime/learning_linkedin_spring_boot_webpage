cmd /c "kill_port 8002" 
cmd /c "mvn clean package"
cd target
java -jar webpage-0.0.1-SNAPSHOT.jar