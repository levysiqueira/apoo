# Análise e Projeto Orientado a Objetos

### Prof. Dr. Fábio Levy Siqueira

Exemplo de Análise e Projeto Orientado a Objetos, seguindo princípios SOLID e GRASP, para um cenário de controle de gastos de materiais de escritório.

## Visão geral

Uma empresa, ao analisar seus relatórios financeiros, percebeu que nos últimos meses houve um aumento no gasto com a compra materiais de escritório. Como esse valor foi considerado alto demais, a empresa decidiu criar um software para controlar essas compras. 

Qualquer funcionário poderá solicitar via a Intranet da empresa os materiais cadastrados. A partir da solicitação, o software deverá emitir um aviso para que o responsável pelo almoxarifado entregue o material solicitado.

Para evitar excessos a empresa definiu uma quota mensal por área para que cada funcionário solicite materiais. Caso o funcionário ultrapasse esse limite, o software deverá pedir a aprovação do gerente da área do funcionário para que o material seja entregue. Caso o funcionário já seja o gerente, o software deverá aprovar automaticamente a solicitação.

O software deverá guardar o histórico das informações, permitindo que os gerentes emitam relatórios sobre o uso de materiais.

## Histórias do Usuário
H1. Eu como funcionário quero solicitar um material para que eu possa usá-lo nas minhas atividades da empresa
- Verificar solicitação de 1 unidade do mesmo produto
- Verificar solicitação de mais de 1 unidade do mesmo produto
- Verificar solicitação de mais de um produto
- Verificar solicitação dentro da quota mensal
- Verificar solicitação fora da quota mensal

H2. Eu como funcionário do almoxarifado quero receber a solicitação aprovada para que eu possa adquirir e distribuir os materiais necessários
-	Verificar 1 material
-	Verificar vários materiais de um mesmo funcionário

H3. Eu como gerente quero aprovar uma solicitação de um funcionário da minha área para que o funcionário possa ter o material esperado
-	Verificar aprovação de solicitação
-	Verificar reprovação de solicitação
-	Verificar solicitação de um gerente
-	Verificar envio de e-mail para o funcionário do almoxarifado

**Dúvidas são explicadas na conversa.**

Existem várias outras histórias, omitidas por simplicidade.

## Modelos e código
- [Diagrama de classes](Classes.png) para as 3 histórias
- [Diagrama de sequência](Sequencia.png) para H1 e H2, considerando 1 material e solicitação não passando da quota.
- [Código fonte](src/) referente ao diagrama de sequência



