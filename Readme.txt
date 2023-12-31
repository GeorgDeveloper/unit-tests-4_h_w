1) Тестовые заглушки полезны при написании модульных тестов, потому что они позволяют изолировать тестируемый код от
зависимостей, таких как внешние сервисы или базы данных. Это позволяет проверить, что код внутри модуля работает
правильно, независимо от внешних факторов.

2) Для проверки, что метод был вызван с определенными аргументами, следует использовать заглушку типа "Mock" или
"Mockito.mock()". Это позволяет отслеживать вызовы методов и аргументы, передаваемые в эти
методы и проверить, что вызов произошел правильно.

3) Для возвращения определенного значения или исключения в ответ на вызов метода следует использовать заглушку
типа "Stub" или "when().thenReturn()" в библиотеке Mockito.

4) Для имитации взаимодействия с внешним API или базой данных следует использовать заглушку типа "Mock" или
"Mockito.mock()", чтобы создать мок-объект, который подменяет поведение внешнего сервиса или базы данных.