module.exports = {
  presets: [
    ['@babel/preset-env', { "modules": false }],
    '@vue/cli-plugin-babel/preset' // 添加 Vue CLI 的 Babel 预设
  ],
  plugins: [
    [
      'component',
      {
        libraryName: 'element-ui',
        styleLibraryName: 'theme-chalk'
      }
    ]
  ]
};
