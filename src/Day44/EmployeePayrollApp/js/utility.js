const getSelectedValues = (propertyValue) => {

    let allItems = document.querySelectorAll(propertyValue);

    let selItems = [];

    allItems.forEach(item => {
        if(item.checked)
            selItems.push(item.value);
    });

    return selItems;
}