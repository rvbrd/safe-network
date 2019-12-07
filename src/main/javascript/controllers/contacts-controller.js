/* eslint-disable no-console */
import contactsView from '../views/contacts-view.js';
import contactsService from '../services/contacts-service.js';

export default {
    async start() {
        const contacts = await contactsService.getContacts();
        contactsView.start(contacts);
    },
    hash: 'contacts',
    unload() {
        contactsView.clear();
    }
};
