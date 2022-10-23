

const path = require('path');
const webpack = require('webpack');
const pkg = require('./package.json');

module.exports = {
    entry: path.join(__dirname, './src/main/react', pkg.main),
    output: {
        path: path.join(__dirname, './src/main/resources/static'),
        filename: 'bundle.js'
    },
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude: /(node_modules)/,
                use: ['babel-loader'],
            },
            {
                test: /\.css$/i,
                use: ['style-loader', 'css-loader']
            },
        ]
    }

};