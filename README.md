Домашние задание.
1. Написать 2 конфигурации бинов 3 студентов и одного преподавателя с использованием
a. Xml: Использовать <bean> (для студентов), @Component с <components-scan> для
преподавателя
b. Java: (@Configuration, @Bean (для студентов), @Component с @ComponentScan для
преподавателя)
Каждая конфигурация должна содержаться в отдельном контексте.
Преподаватель будут принимать список студентов (через @autowired)
Каждый студент должен содержать имя, мапу с оценками (Название предмета: оценка), и
флаг зачислен ли студент (по умолчанию false)
2. Необходимо добавить метод инициализации (на ваш выбор), который зачислит студента
(выставит флаг в true), если у студента средний балл по предметам 3 и выше.
Так же необходимо добавить BeanPostProcessor который перед методом инициализации
повысит баллы студенту с именем Jil(естественно нужно добавить бин студента с этим
именем и баллом ниже 3).
