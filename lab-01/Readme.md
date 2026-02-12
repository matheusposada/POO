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
1. Vá Personal access tokens




### - Salvar em cache as credenciais do PAT

O método de salvar as credênciais em cache garante que o PAT ficará na memória por um tempo determinado, tirando a necessidade do usuário precisar colocar as suas credenciais a cada push para o github

```
git config --global credential.helper cache

git config --global credential.helper 'cache --timeout=3600'

```

## Qual a diferença entre git merge e git rebase?

