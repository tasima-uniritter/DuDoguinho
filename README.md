"# DuDoguinho"  

User story  

Historia:  
Como gestor de eventos  
Quero ter a possibilidade de criar eventos  
Para que meus clientes tenham conhecimento de eventos e suas datas  

Critérios  

#1  
Dado que quero criar um evento  
Quando  carregar o formulário  
Então deve apresentar os seguintes campos:  
*Nome  
*Data do evento  


#2  
Dado que quero criar um evento  
Quando salvar o evento  
Então os campos abaixo devem ser obrigatórios:  
*Nome  
*Data do evento  

#3  
Dado que quero criar um evento  
Quando informar um nome maior que 150 caracteres e salvar  
Então não deve permitir salvar e informar a mensagem:  
"O nome permite no máximo 150 caracteres"  

#4  
Dado que quero criar um evento  
Quando informar uma data inferior ao do dia atual e salvar  
Então não deve permitir salvar e informar a mensagem:  
"A data do evento deve ser igual ou maior que a de hoje"  


#Tips&Tricks  
. Right-click on your project --> Configure --> Add Gradle Nature.
