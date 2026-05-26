const makeServiceCall = (methodType, url, async = true, data = null) => {

    return new Promise((resolve, reject) => {

        let xhr = new XMLHttpRequest();

        xhr.onreadystatechange = function(){

            if(xhr.readyState == 4){

                if(xhr.status >= 200 && xhr.status < 300){

                    resolve(xhr.responseText);

                }else{

                    reject({
                        status: xhr.status,
                        statusText: xhr.statusText
                    });
                }
            }
        }

        xhr.open(methodType, url, async);

        if(data){

            xhr.setRequestHeader(
                "Content-Type",
                "application/json"
            );

            xhr.send(JSON.stringify(data));

        }else{

            xhr.send();
        }
    });
}