"# meuEvento"

# TECs
. Git  
. Eclipse  
. Java 8  
. Spring boot  
. Junit  
. jersey  
. lombok  

# Tips&Tricks  
. Lombok: Download  java -jar lombok.jar >> Add in Eclipse.ini: -javaagent:lombok.jar  
. Gradle: Download dependencies >> Right-click on your project --> Configure --> Add Gradle Nature.  

# TARGET  
. User story  

. Primeira solicita��o  
Como gestor de eventos  
Quero ter a possibilidade de criar eventos  
Para que meus clientes tenham conhecimento de eventos e suas datas. Crit�rios:  

> 1  
Dado que quero criar um evento  
Quando  carregar o formul�rio  
Ent�o deve apresentar os seguintes campos:  
*Nome  
*Data do evento  

> 2  
Dado que quero criar um evento  
Quando salvar o evento  
Ent�o os campos abaixo devem ser obrigat�rios:  
*Nome  
*Data do evento   
  
> 3  
Dado que quero criar um evento  
Quando informar um nome maior que 150 caracteres e salvar  
Ent�o n�o deve permitir salvar e informar a mensagem:  
"O nome permite no m�ximo 150 caracteres"  

> 4  
Dado que quero criar um evento  
Quando informar uma data inferior ao do dia atual e salvar  
Ent�o n�o deve permitir salvar e informar a mensagem:  
"A data do evento deve ser igual ou maior que a de hoje"  

. Segunda solicita��o  