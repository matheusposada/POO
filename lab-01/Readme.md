# Sistema de Controle de Versão

## Configuração inicial para uso do Git

Configurar nome e e-mail no Git
é essencial para identificar a autoria de cada alteração (commit) no histórico do projeto, garantindo rastreabilidade e atribuindo responsabilidade. 


### - Configuração de nome de usuário e e-mail no Git


```
$ git config --global user.name "Seu Nome"
$ git config --global user.email "seuemail@exemplo.br"
```

### - Criando Personal Access Token (PAT) no GitHub

Um Personal Access Token (PAT)
é uma string alfanumérica gerada pelo GitHub que funciona como uma senha alternativa e segura para autenticar operações via linha de comando (Git) ou API. Ele substitui a senha da conta principal, sendo necessário para autenticação de dois fatores (2FA) e automação de fluxos de trabalho. É importante por ter segurança reforçada, acesso restrito, e validade.

Criando um PAT no github:

1. Vá em Settings 
1. Vá em Developer Settings
1. Vá em Personal access tokens
1. Vá em Tokens (classic)
1. Vá em Generate new token
1. Vá em Generate new token (classic)
1. marque o repo, defina o nome e a data de expiração
1. por fim, vá em generate token
1. salve o token pois nunca mais será exibido




### - Salvar em cache as credenciais do PAT

O método de salvar as credênciais em cache garante que o PAT ficará na memória por um tempo determinado, tirando a necessidade do usuário precisar colocar as suas credenciais a cada push para o github

```
git config --global credential.helper cache

git config --global credential.helper 'cache --timeout=3600'

```

## Qual a diferença entre git merge e git rebase?

A principal diferença é que o
git merge une branches preservando o histórico original e criando um novo "commit de merge", enquanto o git rebase reescreve o histórico, reposicionando os commits da sua branch no topo da branch de destino para uma linha de tempo linear.
O uso do merge é ideal para integrar alterações finalizadas a branch principal.
Já o Rebase é ideal para atualizar a branch local com a main antes de integrar, mantendo o trabalho organizado.
