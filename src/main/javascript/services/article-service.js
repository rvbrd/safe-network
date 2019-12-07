const api = {
    dataType: 'json',
    base: 'http://192.168.2.33:8080/womanizer/api',
};

async function getArticle() {
    return new Promise((resolve, reject) => {
        $.getJSON(`${api.base}/article`, {
        }).done(response => {
            console.log(response);
            resolve(response.map(data => ({
                id: data.id,
                title: data.title,
                content: data.content,
                image: data.image,
                summary: data.summary
            })));
        }).fail(reject);
    });
}

export default {
    getArticle
};
