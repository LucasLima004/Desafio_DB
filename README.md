<h1 align="center">Projeto DB server API</h1>

<h3 align="center">Desafio referente ao processo de admissão DB server</h3>
<p align="center">
  <img src="https://img.shields.io/badge/Status-Concluded-green"/>
  <img src="https://img.shields.io/github/issues/LucasLima004/Desafio_DB"/>
</p>
<br>
<br>
<h3>Resultado de pesquisa:</h3>
  <p align="center">
    <img src="https://user-images.githubusercontent.com/99892157/201497018-ca7b699a-34cd-4b54-8686-752498904d2b.png"/>
  </p>
  <ul>
    <li>
      Link para pesquisa geral, clique <a href="http://ec2-52-67-192-100.sa-east-1.compute.amazonaws.com:8080/api/archive" target="_blank">aqui</a>.
    </li>
  </ul>
  
<br>
<h3>Filtragem por TAG:</h3>
  <p align="center"> 
    <img src="https://user-images.githubusercontent.com/99892157/201497154-a5773ede-bd44-4686-ace3-dc5419a5c6db.png"/>
  </p>
  <h4>Resultado:</h4>
  <p align="center"> 
    <img src="https://user-images.githubusercontent.com/99892157/201497288-f0598273-ca3e-45a8-875d-a40a96ec299f.png"/>
  </p>
    <ul>
     <li>
      Link para pesquisa com filtragem pela tag <BCMSG>, clique <a href="http://ec2-52-67-192-100.sa-east-1.compute.amazonaws.com:8080/api/archive/BCMSG" target="_blank">aqui</a>.
     </li>
  </ul>
<br>

<h2>Tecnologias:</h2>
<ul>
  <li>SpringBoot</li>
  <li>Spring frameWork</li>
  <li>Banco h2 em memória</li>
  <li>Maven</li>
  <li>SpringBoot devtools</li>
  <li>JPA java</li>
</ul>



<h5>Description:</h5><br>
<ul>
  <li>
    Para realizar a implementação do desafio, foi utilizado o SpringBoot utilizando o Maven com o padrão MVC, com um banco de dados em memória H2. Sua classe de controle possui métodos de acordo com a requisição HTTP Get, podendo buscar o documento completo ou faer a filtragem do mesmo de acordo com a TAG XML. A versão do Java utilizada foi a 17 e a API está rodando no AWS.
  </li>
  <li>
    O documento é enviado para o banco de dados logo que a há qualquer requisição na raiz.
  </li>
  <li>
    Estrutura da URL para requisição:
    <ul>
      <h4>Busca do documento completo:</h4>
      <li>
         http://ec2-52-67-192-100.sa-east-1.compute.amazonaws.com:8080/api/archive
      </li>
      <h4>Busca do documento filtrando por TAG:</h4>
      <li>
         http://ec2-52-67-192-100.sa-east-1.compute.amazonaws.com:8080/api/archive/TAG-REFERENTE
      </li>
    </ul>
  </li>
</ul>

<h5>Goal Maven usado:</h5><br>
<ul>
  <li>
    clean package.
  </li>
</ul>


<br>
<br>
</p>
