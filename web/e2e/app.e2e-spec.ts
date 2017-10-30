import { Angular4FrontendPage } from './app.po';

describe('todo-web App', () => {
  let page: TodowebPage;

  beforeEach(() => {
    page = new TodowebPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
