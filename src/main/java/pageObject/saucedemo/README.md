1. Все библиотеки обновлены.
2. Заходим в plugin Maven:
a) В Lifecycle нажимаем clean
b) В Lifecycle нажимаем clean
c) В Terminal вводим mvn clean
d) В Terminal вводим mvn install -DskipTests
e) В Terminal вводим mvn clean install -DskipTests
f) В Terminal вводим mvn versions:display-dependency-updates
g) В Terminal вводим mvn versions:use-latest-versions
3. 
a) В Terminal вводим mvn -Dtest=Lecture9_1Test test
b) В Terminal вводим mvn  mvn -Dtest=Lecture9_1Test,Lecture9_2Test test (выбивает ошибку)
c) В Terminal вводим mvn  mvn -Dtest=Lecture9_2Test#test1 test
d) В Terminal вводим mvn clean install одного Xml файла
e) Заходим в target->surfire suite->index.html