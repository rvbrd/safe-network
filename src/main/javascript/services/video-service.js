const api = {
    dataType: 'json',
    base: 'http://192.168.2.33:8080/womanizer/api',
};

async function getVideo() {
    return new Promise((resolve, reject) => {
        $.getJSON(`${api.base}/video`, {
        }).done(response => {
            console.log(response);
            resolve(response.map(data => ({
                title: data.title,
                url: data.youtubeId,
                thumbnail: data.thumbnail
            })));
        }).fail(reject);
    });
}

export default {
    getVideo
};
