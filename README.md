POC of how service templates can be implemented using spring-boot

- spring-boot-base-service -> Actual template
  - main-app -> This just includes Application and BaseConfiguration in separate module. This is added as a dependency on spring-boot-base-service
- spring-boot-default-service -> Uses template service with no behavior overriding
- spring-boot-product-service -> Uses template service but modifies one of the configuration(rest-template) 
