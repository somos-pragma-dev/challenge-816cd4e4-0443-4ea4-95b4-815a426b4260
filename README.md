# Desarrollo de Microservicio REST

El equipo de desarrollo de una fintech necesita implementar un microservicio REST que gestione la información de clientes. El microservicio debe permitir la creación, lectura, actualización y eliminación de registros de clientes. Los clientes tienen atributos como nombre, email y fecha de nacimiento. El microservicio debe asegurar la unicidad del email y validar la fecha de nacimiento para que no sea futura. El sistema debe manejar correctamente los errores de validación y persistencia.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del Modelo de Datos

**Objetivo:** Definir y validar el modelo de datos para los clientes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los atributos necesarios para un cliente.
- Establecer las restricciones de unicidad y validación para el email y la fecha de nacimiento.

**Entregable:** Modelo de datos definido y validado.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las restricciones de negocio para los atributos de los clientes.
- Piensa en cómo representar la unicidad y las validaciones en el modelo de datos.

</details>

### Fase 2: Implementación del Microservicio REST

**Objetivo:** Implementar el microservicio REST para gestionar los clientes.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Crear los endpoints REST para las operaciones CRUD de clientes.
- Implementar la lógica de negocio para validar los datos de entrada.
- Manejar los errores de validación y persistencia de manera adecuada.

**Entregable:** Microservicio REST implementado y funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza las mejores prácticas para el desarrollo de microservicios.
- Considera cómo manejar los errores y devolver respuestas adecuadas al cliente.

</details>

### Fase 3: Pruebas y Optimización

**Objetivo:** Realizar pruebas y optimizar el microservicio.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Realizar pruebas unitarias y de integración para validar el funcionamiento del microservicio.
- Identificar y corregir posibles puntos de mejora en la implementación.

**Entregable:** Microservicio REST optimizado y con pruebas unitarias y de integración.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza herramientas y frameworks de testing adecuados.
- Considera cómo mejorar la eficiencia y la mantenibilidad del código.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un microservicio REST y cuáles son sus componentes principales?
- **paraQueSirve**: ¿Para qué sirve el modelo de datos en un microservicio REST?
- **comoSeUsa**: ¿Cómo se usa la validación de datos en un microservicio REST?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un microservicio REST y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de un microservicio REST en términos de arquitectura y diseño?

## Criterios de Evaluacion

- Definición y validación del modelo de datos para los clientes.
- Implementación de los endpoints REST para las operaciones CRUD.
- Manejo adecuado de los errores de validación y persistencia.
- Realización de pruebas unitarias y de integración.
- Identificación y corrección de puntos de mejora en la implementación.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
