///**
// * Created by valera on 12.07.15.
// */
Ext.application({
    name: 'AT',
    appFolder: 'app',

    requires: ['Ext.container.Viewport'],

    launch: function () {
        console.log('App is launched');
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                title: 'air-trans'
            }
        })
    }
});