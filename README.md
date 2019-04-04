# MFES-FEUP
<br><br>
Criada a classe facebook onde estão todos os users e todos os posts (para login e logoff e pouco mais, para já) e que funcionará como classe main
<br><br>
 - Funções na classe User:<br>
    - Criar User<br>
    - Métodos get e set para todos os parâmetros do User<br>
    - Editar Password editPassword<br>
    - Adicionar Amigo addFriend<br>
    - Promover Amigo a BestFriend addBestFriend<br>
    - Adicionar Post addPost<br>
    - Remover Post removePost<br>
    - Função Auxiliar - Verificar se um user pertence aos amigos checkFriend<br>
<br>
 - Funções na classe Post: <br>
    - Criar Post <br>
    - Métodos Get e Set para todos os parâmetros do Post<br> <br>
 - Funções na classe Facebook<br> 
    - Login login<br> 
    - Logoff logoff<br> 
    - Função Auxiliar - getUserByEmail <br> 
 
<br> 
- Em falta:<br> 
  - id incremental no user<br> 
  - criar dados para testar<br> 
  - Funções de comparação de datas de posts (feito) <br> 
  - Assim que user é criado adicioná-lo ao set de users da classe Facebook - adicionado a db criada na classe user<br> 
  - Permissões de LOGGED_IN e LOGGED_OFF (o que cada user pode ver)<br> 
  - Mural (Feed de Notícias)  como estruturar (primeiro posts dos best friends por data, depois posts dos friends por data)<br> 
  - Assim que post é criado adicioná-lo ao set de posts na classe Facebook (E quando removido, removê-lo) <br> 
  - Desativar conta (remove account que seria torná-la inacessivel, mas manter os posts e os amigos)<br> 
  - Accept e Reject Pedidos de amizade (pode não ser necessário)<br> 
 <br> 
 ### Para correr o projeto: <br><br>
 uml_import -> Run As -> Run Configurations -> Launch Mode -> Console
 
