# softQA_randomUserAPI
<b>SOBRE</b></br>
Projeto Maven de teste com api Rest de reservas.</br>
Documentação da API: https://randomuser.me/</br>
</br>
<b>CONFIRGURAÇÕES DE AMBIENTE</b></br>
maven.compiler.source: 1.7</br>
maven.compiler.target: 1.7</br>
</br>
Dependencias:</br>
junit versão 4.11</br>
rest-assured versão 4.0.0</br>
</br>
<b>CASOS DE TESTES</b></br>
</br>
Teste 1 - retornarListaVinteUsuarios</br>
DADO que existam no mínimo 20 usuários aleatórios</br>
QUANDO solicitado para retornar </br>
ENTÃO sistema deve listar dados de20 usuários.</br>
</br>
Teste 2 - retornarUsuarioNacionalidadeBrasileiroa</br>
DADO </br>
QUANDO solicitado um usuário de nacionalidade definida como brasileira</br>
ENTÃO sistema deve retornar usuário com nacionalidade igual a brasileira (NAC == BR) .</br>
</br>
Teste 3 - retornarUsuarioNacionalidadeDefinida</br>
DADO </br>
QUANDO </br>
ENTÃO </br>
</br>
Teste 4 - retornarUsuarioPaginaDefinida</br>
DADO que exista uma reserva cadastrada</br>
QUANDO </br>
ENTÃO sistema deve retornar usuário gerado na página 3.</br>
</br>
Teste 5 - retornarApenasDadosNomeEmail</br>
DADO que precise apenas dos dados de nome e e-mail de usuário</br>
QUANDO </br>
ENTÃO sistema deve retornar apenas os dados de nome e e-mail do usuário gerado.</br>
