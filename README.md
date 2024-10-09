# SmartContactManager

**SmartContactManager** is a web application designed to save and manage contacts, functioning as a digital phonebook.

## New Learning Things from This Project

### 1. UI Components
- Built using components from **Flowbite**, including cards, navbar, and forms, to provide a clean and responsive user interface.

### 2. Styling with Tailwind CSS
- Styled using **Tailwind CSS**, a flexible and streamlined alternative to Bootstrap.
- To reflect the latest changes in your styles, use the following command whenever you update the frontend (e.g., adding new Tailwind classes):
  ```bash
  npx tailwindcss -i ./src/input.css -o ./src/output.css --watch

### 3. Dynamic Frontend Color
- Using session objects, the frontend color can change dynamically. For example, upon successful registration, a green color is shown. The session object is removed after the page is reloaded, ensuring the message is displayed only once.
  ```java
  <th:block th:text="${@sessionHelper.removeMessage()}"></th:block>

### 4. @ModelAttribute Annotation
- The method annotated with `@ModelAttribute` is automatically invoked before any request handler methods in the controller. This allows you to add common attributes (like user details) to the model, making them accessible across different views.

### 5. @ControllerAdvice Annotation
- `@ControllerAdvice` is a specialized component that allows you to handle exceptions and apply model attributes across multiple controllers in a consistent way. It helps to centralize common logic, such as exception handling and shared data, across all controllers in your application.

### 6. Cloudinary Integration
- Using **Cloudinary**, we save images to the cloud by using a public ID. This public ID is used to fetch the image URL.
  - **Method name in code**: `getUrlFromPublicId`

### 7. Custom Annotation: @ValidFile
- Created a custom annotation `@ValidFile` to handle file validation.

### 8. Pagination
- Pagination is implemented to handle large sets of contacts efficiently.

### 9. Custom Finder Method: `findByUserAndNameContaining`
- The `Containing` keyword in this custom finder method performs a "like" search, allowing partial matches for the `name` field in the database.

### 10 . @JsonIgnore:
- 
In Spring Boot, @JsonIgnore is an annotation used to ignore a specific field or property during JSON serialization and deserialization. This means that when an object is converted to JSON (serialization) or JSON is converted to an object (deserialization), the field marked with @JsonIgnore will be omitted. It is often used to hide sensitive information or exclude irrelevant fields.