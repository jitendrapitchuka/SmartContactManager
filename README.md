# SmartContactManager

SmartContactManager is a web application designed to save and manage contacts, functioning like a digital phonebook.

## New things

- **UI Components**: 
  - Built with components from `Flowbite` including cards, navbar, forms, and more, for a clean and responsive user interface.
  
- **CSS**:
  - Styled with `Tailwind CSS`, offering a streamlined and flexible alternative to Bootstrap.
  -  To ensure your styles reflect the latest changes, run the following command whenever you update the frontend (e.g., adding new Tailwind classes):

    ```bash
    npx tailwindcss -i ./src/input.css -o ./src/output.css --watch


- **Dynamic Frontend Color**:
  - Using session objects, the frontend color can change dynamically. For example, upon successful registration, a green color is shown. The session object is removed after the page is reloaded, ensuring the message is displayed only once.

``` java 
<th:block th:text="${@sessionHelper.removeMessage()}"></th:block>