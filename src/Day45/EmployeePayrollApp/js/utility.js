const getInputValueById = (id) => {
    let value = document.getElementById(id).value;
    return value;
}

const setTextValue = (id, value) => {
    const element = document.querySelector(id);
    element.textContent = value;
}