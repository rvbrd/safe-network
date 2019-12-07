const api = {
    dataType: 'json',
    base: 'http://192.168.2.33:8080/womanizer/api',
};

async function getContacts() {
    return new Promise((resolve, reject) => {
        $.getJSON(`${api.base}/therapist`, {
        }).done(response => {
            console.log(response);
            resolve(response.map(data => ({
                name: data.name,
                email: data.email,
                phone: data.phone,
                location: data.location
            })));
        }).fail(reject);
    });
}

export default {
    getContacts
};
