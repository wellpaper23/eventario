#Eventário – Sistema de Gestão de Eventos
Aplicação para gestão de ciclo de vida de eventos, integrando controle de participantes, orçamento, infraestrutura e regras de conformidade. Desenvolvido como solução prática para demandas reais do setor de eventos.

##Stack Tecnológica
- Java 21: Versão LTS para alta performance e recursos modernos (Records, Pattern Matching).
- Spring Boot 4.x: Core da aplicação para gerenciamento de contexto e injeção de dependências.
- Spring Data JPA / Hibernate: Camada de persistência e mapeamento objeto-relacional (ORM).
- Flyway: Versionamento estruturado de schemas de banco de dados (Migrations).
- PostgreSQL: Banco de dados relacional para alta integridade de dados.
- Maven: Automação de build e gerenciamento de dependências.
- Docker & Docker Compose: Orquestração de containers para infraestrutura isolada.
- Git/GitHub: Controle de versão e colaboração.
##Funcionalidades Principais
- Arquitetura Modular (Package by Feature): Organização focada em escalabilidade e manutenção.
- Sistema de Identidade: Utilização de UUIDs para segurança em APIs REST.
- Gestão de Recursos: Cadastro, listagem e controle de permissões (RBAC).
- Validação de Conflitos: Algoritmos para garantir a disponibilidade de horários e locais.
- Integração de Inscrições: Fluxo completo de registro e validação de participantes.

##Pré requisitos
- Java 21 ou superior
- Docker & Docker Compose
- Maven
- Git
##Instalação  
- git clone https://github.com/wellpaper23/eventario.git
- cd eventario
- cp .env.example .env
- ./mvnw clean install
- docker compose up -d
##Execução
- java -jar target/<eventariofile.jar>
  
