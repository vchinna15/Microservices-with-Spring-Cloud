# Microservices-with-Spring Boot
Microservice is a small(doing one thing/delivering single business capability), autonomous(deployed as single unit as technology-agnostic APIs) service. Communication between microservices are via network calls(which creates a distributed system and all the problems of distributed system like network failure, distributed transaction etc.).

Evolution of Microservice Architecture style:
Monolithic Architecture-> Distributed Architecture -> Service Oriented Architecture(coarse-grained service) -> Microservice Architecture(fine-grained service) & API

Scale Cude:
1. X-Axis Scaling- Cloning/Replicating (running multiple instances of an application)
2. Y-Axis Scaling - Functional Decomposition(splitting functionality into multiple services- Microservices follow this approach)
3. Z-Axis Scaling - running multiple instance of same application but each application access different subset of data(sharding)(used mainly at db side)

Microservice exposes Servie Endpoints as APIs. Service Endpoints are defined as REST/JSON over HTTP.

Microservice Architecture:
REST Architecture Principles
IPC(Inter Process Communication)
Transaction Management

Microservice Design(Loosely Coupled and Highly Cohesive):
howto model the microservice
howto integrate the microservices

Microservice Development:

Microservice Testing:
Unit Tests - Service tests - UI(End-to--End0 Tests

Microservicr Deployment:

Microservice Monitoring:

Microservice Security:

Microservice at scale(Scalable architecture):
Fault tolerant, highly available, high performing(fast response time), highly scalable

Scalable Architecture design principles:
Simplicity
Decomposition
Asynchronous
Loose Coupling High Cohesion
Concurrency and Parellization
Decentralization/Distribution
Stateless


Scalable Architecture Design Patterns:


Scalable Architecture Building Blocks(tools and frameworks):
Load Balancers
Messaging Queues
Caches
Reverse Proxy

REST (REpresentational State Transfer) API:
REST is an architectural style for Distributed hypermedia systems.

Archotectural principles(constraints) of REST:
Client-Server
Staeless
Caheable
Uniform Interface
Layered System
Code on Demand

Key Terminologies:
Resource - any information that can be named is a resource. It could be a document or image or textor object
Resource Identifier - is used  to identify a particular resource (/books/21212)
Resource Representation- state of the resource at any particular timestamp. It consists of data metadata and hypermedia links.
Media type: is a data format of a resource representation.
Resource Methods - (GET/POST...) - used to perform transition to the resouce.
REST is not HTTP: Client and server exchange resource representation through HTTP protocol.
Data format of the representaion is decoupled from the resource. so resoure can be in HTML, XML, JSOkN or any other format.
Meta data is available to control cache, to transmit errors, to negotiate appropriate represntation and to perform autnetication and access control.

How to design REST API:
Identify object model
create model URIs
Determine representations
Assign HTTP Methods
Logging/Security/discovery



Spring Boot can be used as a framework for HTTP/REST implementation to develop RESTFul Microservices.
Spring CLoud provides implementation for common distributed design patterns.

Microserviec Architecture patterns

Application patterns

  Desomposition patterns
  
      by business capability
      By Sub domain
      self contained service
  Data Patterns
  
    shared database 
    databese per service
    Querying patterns
      CQRS(Domain Event, Event sourcing
      API Composition
     Data consistency pattern
      Saga    
  Testing apttern
  UI Pattern
  
Application Infrastructure patterns
  Communication pattern
  
   Communication Style: If each request must be processed by single microsrvice app, use synchronous communication(http protocol). If each request is processed by multiple   service, then use aynshronous communication style(messaging protocol-jms or TCP). Usually Query Requests(payment history, search customer) use synchronous; Data Updates(create order, create payment) requests use asynchronous.
     
  cross-cutting concerns pattern
  security
  observability
  deployment
  Deployment

